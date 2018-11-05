import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

@IonicPage()
@Component({
  selector: 'page-cadastro-filme',
  templateUrl: 'cadastro-filme.html',
})
export class CadastroFilmePage {

  public cadastroFilme = {};

  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad CadastroFilmePage');
  }

}
