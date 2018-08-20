import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router'

import { AppComponent } from './app.component';
import { ContatoModule } from './contato/contato.module'
import { NossaVisaoModule } from './nossa-visao/nossa-visao.module'
import { QuemSomosModule } from "./quem-somos/quem-somos.module";
import { AppRoutingModule } from './app-routing.module'

@NgModule({
  declarations: [
    AppComponent    
  ],
  imports: [
    BrowserModule,
    RouterModule,
    ContatoModule,
    NossaVisaoModule,
    QuemSomosModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
