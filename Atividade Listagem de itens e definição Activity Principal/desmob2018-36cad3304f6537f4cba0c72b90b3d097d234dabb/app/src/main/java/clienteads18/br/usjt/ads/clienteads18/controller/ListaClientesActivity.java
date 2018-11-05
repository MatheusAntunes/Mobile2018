package clienteads18.br.usjt.ads.clienteads18.controller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import clienteads18.br.usjt.ads.desmob.clienteads18.R;

public class ListaClientesActivity extends Activity {
    public static final String NOME = "clienteads18.br.usjt.ads.clienteads18.controller.nomedocliente";
    private ArrayList<String> clientes;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        activity = this;

        //Recebendo dados da Activity anterior
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);

        //Buscando cliente pela chave selecionada
        clientes = buscaClientes(chave);

        ListView listView = (ListView)findViewById(R.id.lista_clientes);

        //Adapter Pattern para inserção da lista na ListView
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                                    android.R.layout.simple_list_item_1, clientes);

        listView.setAdapter(adapter);

        //Click Listener para a seleção do item na lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nome = clientes.get(position);
                Intent intent = new Intent(activity, DetalheClienteActivity.class);
                intent.putExtra(NOME, nome);

                startActivity(intent);
            }
        });
    }

    private ArrayList<String> buscaClientes(String chave) {
        ArrayList<String> resultadoBusca;

        if ( chave != null && chave.length() > 0 ) {
            resultadoBusca = new ArrayList<>();
            ArrayList<String> lista = listaClientes();

            for (String cliente:lista) {
                if ( cliente.toUpperCase().contains(chave.toUpperCase()) ) {
                    resultadoBusca.add(cliente);
                }
            }

            return resultadoBusca;
        } else {
            return listaClientes();
        }
    }

    private ArrayList<String> listaClientes() {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Carlos Drummond de Andrade");
        lista.add("Manuel Bandeira");
        lista.add("Olavo Bilac");
        lista.add("Vinícius de Moraes");
        lista.add("Cecília Meireles");
        lista.add("Castro Alves");
        lista.add("Gonçalves Dias");
        lista.add("Ferreira Gullar");
        lista.add("Machado de Assis");
        lista.add("Mário de Andrade");
        lista.add("Cora Coralina");
        lista.add("Manoel de Barros");
        lista.add("João Cabral de Melo Neto");
        lista.add("Casimiro de Abreu");
        lista.add("Paulo Leminski");
        lista.add("Álvares de Azevedo");
        lista.add("Guilherme de Almeida");
        lista.add("Alphonsus de Guimarães");
        lista.add("Mário Quintana");
        lista.add("Gregório de Matos");
        lista.add("Augusto dos Anjos");

        return lista;
    }
}
