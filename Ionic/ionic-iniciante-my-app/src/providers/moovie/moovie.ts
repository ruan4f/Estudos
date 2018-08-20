import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

/*
  Generated class for the MoovieProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MoovieProvider {

  private apiKey: string = 'b334fd0bb3094cfea5046a733d4270f3';
  private urlBase: string = 'https://api.themoviedb.org/3';
  private language: string = 'pt-BR';

  constructor(public http: HttpClient) {
    console.log('Hello MoovieProvider Provider');
  }

  getLatestMovies(page = 1) {
    return this.http.get(`${this.urlBase}/movie/popular?page=${page}&api_key=${this.apiKey}&language=${this.language}`);
  }

  getMovieDetails(movieId) {
    return this.http.get(`${this.urlBase}/movie/${movieId}?api_key=${this.apiKey}&language=${this.language}`);
  }

}
