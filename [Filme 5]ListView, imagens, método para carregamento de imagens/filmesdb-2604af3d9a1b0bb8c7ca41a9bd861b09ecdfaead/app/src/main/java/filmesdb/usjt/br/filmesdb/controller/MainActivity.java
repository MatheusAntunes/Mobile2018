package filmesdb.usjt.br.filmesdb.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import filmesdb.usjt.br.filmesdb.R;

public class MainActivity extends Activity {
    public static final String GENERO = "filmesdb.usjt.br.filmesdb.controller.genero";
    private String spinnerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Popula o spinner
        final Spinner spinner = (Spinner) findViewById(R.id.generos_spinner);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.generos_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Adiciona o spinner populado na tela
        spinner.setAdapter(adapter);

        //Evento de seleção do spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinnerValue = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerValue = spinner.getSelectedItem().toString();
    }

    public void buscarFilmes(View view) {
        Intent intent = new Intent(this, ListaFilmesActivity.class);
        intent.putExtra(GENERO, spinnerValue);
        startActivity(intent);
    }
}
