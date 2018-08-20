import { ToastController } from 'ionic-angular';
import { Injectable } from '@angular/core';
import { Storage } from '@ionic/storage';
import { Http, Headers, RequestOptions } from '@angular/http';
import 'rxjs/add/operator/map';

/*
  Generated class for the AuthProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class AuthProvider {
  private msg: string = 'É preciso logar para acessar!';

  constructor(
    public http: Http,
    public storage: Storage,
    public toastCtrl: ToastController) {
      
  }

  login(credentials) {
    let headers = new Headers();
    headers.append('Content-Type', 'application/json')

    let options = new RequestOptions({ headers: headers })

    this.http.post('', credentials, options)
      .map(res => res.json())
      .subscribe(data => {
        this.storage.set('token', data.token);
      })
  }

  userIsLogged() {
    return this.storage.get('token')
      .then(val => {
        if (val) {
          return val;
        } else {
          let toast = this.toastCtrl.create({
            message: this.msg,
            duration: 3000
          });
          toast.present();

          return false;
        }
      })
  }

  logout() {
    this.storage.remove('token');
  }

}
