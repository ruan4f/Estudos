export default {
  database: 'books',
  username: 'root',
  password: '1234',
  params: {
    dialect: 'mysql',
    host: '127.0.0.1',
    port: 3306,
    operatorsAliases: false,
  },
  jwtSecret: 'S3cr3t',
  jwtSession: { session: false },
};
