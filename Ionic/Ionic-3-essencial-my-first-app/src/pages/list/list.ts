import { AuthProvider } from './../../providers/auth/auth';
import { Component } from '@angular/core';
import { NavController, NavParams, ToastController } from 'ionic-angular';
import { Http, Headers, RequestOptions } from '@angular/http';
import { Camera, CameraOptions } from '@ionic-native/camera';

@Component({
  selector: 'page-list',
  templateUrl: 'list.html'
})
export class ListPage {
  selectedItem: any;
  icons: string[];
  public url: string = "http://localhost:45697/api/v1";
  public beer = {
    name: "",
    price: "",
    type: "",
    mark: "",
    img: ""
  };

  constructor(public navCtrl: NavController,
    public toastCtrl: ToastController,
    public navParams: NavParams,
    public http: Http,
    public camera: Camera,
    public authService: AuthProvider) {

  }

  ionViewCanEnter() {
    return this.authService.userIsLogged();
  }

  saveBeer(beer) {
    let headers = new Headers();

    headers.append('Content-Type', 'application/json')

    let options = new RequestOptions({ headers: headers })

    this.http.post(this.url + '/beers2', beer, options)
      .map(res => res.json())
      .subscribe(data => {
        let toast = this.toastCtrl.create({
          message: data.msg,
          duration: 3000
        });
        toast.present();
      })
  }

  getPhoto() {
    const options: CameraOptions = {
      quality: 100,
      destinationType: this.camera.DestinationType.DATA_URL,
      encodingType: this.camera.EncodingType.JPEG,
      mediaType: this.camera.MediaType.PICTURE
    }

    this.camera.getPicture(options).then((imageData) => {
      let base64Image = 'data:image/jpeg;base64,' + imageData;
      this.beer.img = base64Image;
    }, (err) => {
      // Handle error
    });
  }

}
