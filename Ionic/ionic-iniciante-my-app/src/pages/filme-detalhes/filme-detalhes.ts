import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController } from 'ionic-angular';
import { MoovieProvider } from '../../providers/moovie/moovie';

@IonicPage()
@Component({
  selector: 'page-filme-detalhes',
  templateUrl: 'filme-detalhes.html',
  providers: [
    MoovieProvider
  ]
})
export class FilmeDetalhesPage {

  public filme: any;
  public id;
  public loader;

  constructor(public navCtrl: NavController, public navParams: NavParams, public movieProvider: MoovieProvider,
    public loadingCtrl: LoadingController) {

  }

  ionViewDidLoad() {
    this.id = this.navParams.get('id');
    this.presentLoading();
    this.movieProvider.getMovieDetails(this.id)
      .subscribe(data => {
        console.log(data)
        const movie = (data as any);
        this.filme = movie;
        this.closeLoading();
      }, error => {
        console.log(error)
        this.closeLoading();
      })
  }

  presentLoading() {
    this.loader = this.loadingCtrl.create({
      content: "Carregando..."
    });
    this.loader.present();
  }

  closeLoading() {
    this.loader.dismiss();
  }

}
