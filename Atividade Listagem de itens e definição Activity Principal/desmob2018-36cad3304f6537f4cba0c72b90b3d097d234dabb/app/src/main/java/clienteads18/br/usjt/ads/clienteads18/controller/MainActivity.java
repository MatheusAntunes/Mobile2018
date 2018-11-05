package clienteads18.br.usjt.ads.clienteads18.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import clienteads18.br.usjt.ads.desmob.clienteads18.R;

public class MainActivity extends Activity {
    public static final String CHAVE = "clienteads18.br.usjt.ads.clienteads18.controller.chave";
    private EditText txtBusca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBusca = (EditText)findViewById(R.id.txt_busca);
    }

    public void buscarClientes(View view) {
        Intent intent = new Intent(this, ListaClientesActivity.class);
        String texto = txtBusca.getText().toString();
        intent.putExtra(CHAVE, texto);

        startActivity(intent);
    }
}
