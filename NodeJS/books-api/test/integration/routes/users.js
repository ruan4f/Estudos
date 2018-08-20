import jwt from 'jwt-simple';

describe('Routes Users', () => {
  const { Users } = app.datasource.models;
  const jwtSecret = app.config.jwtSecret;
  const defaultUser = {
    id: 1,
    name: 'Default User',
    email: 'test@email.com',
    password: 'test',
  };

  let token;

  beforeEach((done) => {
    Users
      .destroy({ where: {} })
      .then(() => Users.create({
        name: 'John',
        email: 'john@gmail.com',
        password: '12345',
      }))
      .then((user) => {
        Users.create(defaultUser).then(() => {
          token = jwt.encode({ id: user.id }, jwtSecret);
          done();
        });
      });
  });

  describe('Route GET /Users', () => {
    it('should return a list of Users', (done) => {
      request
        .get('/Users')
        .set('Authorization', `JWT ${token}`)
        .end((err, res) => {
          expect(res.body[0].id).to.be.eql(defaultUser.id);
          expect(res.body[0].name).to.be.eql(defaultUser.name);
          expect(res.body[0].email).to.be.eql(defaultUser.email);

          done(err);
        });
    });
  });

  describe('Route GET /Users', () => {
    it('should return a User', (done) => {
      request
        .get('/Users/1')
        .set('Authorization', `JWT ${token}`)
        .end((err, res) => {
          expect(res.body.id).to.be.eql(defaultUser.id);
          expect(res.body.name).to.be.eql(defaultUser.name);
          expect(res.body.email).to.be.eql(defaultUser.email);

          done(err);
        });
    });
  });

  describe('Route POST /Users', () => {
    it('should create a User', (done) => {
      const newUser = {
        id: 2,
        name: 'newUser',
        email: 'newtest@email.com',
        password: 'newtest',
      };
      request
        .post('/Users')
        .set('Authorization', `JWT ${token}`)
        .send(newUser)
        .end((err, res) => {
          expect(res.body.id).to.be.eql(newUser.id);
          expect(res.body.name).to.be.eql(newUser.name);
          expect(res.body.email).to.be.eql(newUser.email);

          done(err);
        });
    });
  });

  describe('Route PUT /Users/{id}', () => {
    it('should update a User', (done) => {
      const updatedUser = {
        id: 1,
        name: 'updated User',
        email: 'updatedtest@email.com',
        password: 'updatedtest',
      };
      request
        .put('/Users/1')
        .set('Authorization', `JWT ${token}`)
        .send(updatedUser)
        .end((err, res) => {
          expect(res.body).to.be.eql([1]);
          done(err);
        });
    });
  });

  describe('Route DELETE /Users/{id}', () => {
    it('should delete a User', (done) => {
      request
        .delete('/Users/1')
        .set('Authorization', `JWT ${token}`)
        .end((err, res) => {
          expect(res.statusCode).to.be.eql(204);
          done(err);
        });
    });
  });
});
