import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { MeusFilmesPage } from './meus-filmes';

@NgModule({
  declarations: [
    MeusFilmesPage,
  ],
  imports: [
    IonicPageModule.forChild(MeusFilmesPage),
  ],
})
export class MeusFilmesPageModule {}
