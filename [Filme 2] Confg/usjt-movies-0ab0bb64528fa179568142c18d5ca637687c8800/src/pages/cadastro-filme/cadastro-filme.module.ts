import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { CadastroFilmePage } from './cadastro-filme';

@NgModule({
  declarations: [
    CadastroFilmePage,
  ],
  imports: [
    IonicPageModule.forChild(CadastroFilmePage),
  ],
})
export class CadastroFilmePageModule {}
