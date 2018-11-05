import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { CadastroFilmePage } from '../cadastro-filme/cadastro-filme';

@IonicPage()
@Component({
  selector: 'page-meus-filmes',
  templateUrl: 'meus-filmes.html',
})
export class MeusFilmesPage {

  public meusFilmes: any = [];

  constructor(public navCtrl: NavController, public navParams: NavParams) {
    
  }
  
  ionViewDidLoad() {
    console.log('ionViewDidLoad MeusFilmesPage');
  }

  abreCadastroFilme(){
    this.navCtrl.push(CadastroFilmePage);
  }

}
