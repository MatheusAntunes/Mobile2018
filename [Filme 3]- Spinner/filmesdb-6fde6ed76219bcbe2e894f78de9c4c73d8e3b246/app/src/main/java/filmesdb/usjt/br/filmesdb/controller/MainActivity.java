package filmesdb.usjt.br.filmesdb.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import filmesdb.usjt.br.filmesdb.R;

public class MainActivity extends Activity {

    public static final String GENERO = "filmesdb.usjt.br.filmesdb.controller.genero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscarFilmes(View view) {
        Intent intent = new Intent(this, ListaFilmesActivity.class);

        startActivity(intent);
    }
}
