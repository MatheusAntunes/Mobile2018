package clienteads18.br.usjt.ads.clienteads18.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import clienteads18.br.usjt.ads.desmob.clienteads18.R;

public class DetalheClienteActivity extends Activity {
    private TextView nomeClienteEscolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cliente);

        //Faz o bind do EditText contido no layout
        nomeClienteEscolhido = (TextView)findViewById(R.id.txt_nome);

        //Recebe valor da Activity anterior
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListaClientesActivity.NOME);

        //Seta o valor na propriedade da View
        nomeClienteEscolhido.setText(nome);
    }
}
