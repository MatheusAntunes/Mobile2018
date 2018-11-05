package filmesdb.usjt.br.filmesdb.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import filmesdb.usjt.br.filmesdb.R;

public class DetalheFilmeActivity extends Activity {
    private TextView tituloFilme, diretorFilme, lancamentoFilme, popularidadeFilme;
    private ImageView fotoFilme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);

        //"Binda" as propriedades da tela
    }
}
