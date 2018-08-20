import { MoovieProvider } from '../../providers/moovie/moovie';
import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController } from 'ionic-angular';
import { FilmeDetalhesPage } from '../filme-detalhes/filme-detalhes';

/**
 * Generated class for the FeedPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-feed',
  templateUrl: 'feed.html',
  providers: [
    MoovieProvider
  ]
})
export class FeedPage {

  public feed = {
    titulo: 'Ruan Ferreira',
    data: '22/01/2018 data',
    descricao: 'Feed de teste de json',
    qntdLikes: 12,
    qntdComments: 24,
    timeComment: '11h ago'
  }

  public nomeUsuario: string = 'Ruan Ferreira da Silva';
  public listaFilmes = new Array<any>();
  public loader;
  public refresher;
  public isRefreshing: boolean = false;
  public page = 1;
  public infiniteScroll;

  constructor(
    public navCtrl: NavController,
    public navParams: NavParams,
    private movieProvider: MoovieProvider,
    public loadingCtrl: LoadingController) {
  }

  public somaDoisNumeros(numb1, numb2): number {
    return numb1 + numb2;
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad FeedPage');
    this.getMovies();
  }

  getMovies(newPage: boolean = false) {
    this.presentLoading();
    this.movieProvider.getLatestMovies(this.page).subscribe(data => {
      const response = (data as any);

      if (newPage) {
        this.listaFilmes = this.listaFilmes.concat(response.results);
        this.infiniteScroll.complete();
      } else {
        this.listaFilmes = response.results;
      }     

      if (this.isRefreshing) {
        this.refresher.complete();
        this.isRefreshing = false;
      }
      this.closeLoading();
    }, error => {
      console.log(error)
      if (this.isRefreshing) {
        this.refresher.complete();
        this.isRefreshing = false;
      }
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

  doRefresh(refresher) {
    this.refresher = refresher;
    this.isRefreshing = true;
    this.getMovies();
  }

  doInfinite(infiniteScroll) {
    this.page++;
    this.infiniteScroll = infiniteScroll;

    this.getMovies(true);
  }

  abrirDetalhes(filme) {
    console.log(filme);
    this.navCtrl.push(FilmeDetalhesPage, { id: filme.id });
  }
}
