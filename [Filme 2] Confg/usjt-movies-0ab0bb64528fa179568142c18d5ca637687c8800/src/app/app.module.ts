import { NgModule, ErrorHandler } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';

import { MeusFilmesPageModule } from '../pages/meus-filmes/meus-filmes.module';
import { LancamentoPageModule } from '../pages/lancamento/lancamento.module';
import { PopularidadePageModule } from '../pages/popularidade/popularidade.module';
import { GeneroPageModule } from '../pages/genero/genero.module';
import { CadastroFilmePageModule } from '../pages/cadastro-filme/cadastro-filme.module';

import { TabsPage } from '../pages/tabs/tabs';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';

@NgModule({
  declarations: [
    MyApp,
    TabsPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp),
    MeusFilmesPageModule,
    LancamentoPageModule,
    PopularidadePageModule,
    GeneroPageModule,
    CadastroFilmePageModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    TabsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
