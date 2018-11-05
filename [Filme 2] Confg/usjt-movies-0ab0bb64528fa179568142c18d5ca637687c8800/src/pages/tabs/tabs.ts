import { Component } from '@angular/core';

import { MeusFilmesPage } from '../meus-filmes/meus-filmes';
import { PopularidadePage } from '../popularidade/popularidade';
import { LancamentoPage } from '../lancamento/lancamento';
import { GeneroPage } from '../genero/genero';

GeneroPage
@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tab1Root = LancamentoPage;
  tab2Root = PopularidadePage;
  tab3Root = GeneroPage;
  tab4Root = MeusFilmesPage;

  constructor() {

  }
}
