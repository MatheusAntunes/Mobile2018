package filmesdb.usjt.br.filmesdb.controller;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import filmesdb.usjt.br.filmesdb.R;
import filmesdb.usjt.br.filmesdb.model.Filme;
import filmesdb.usjt.br.filmesdb.model.FilmeDAO;

public class ListaFilmesActivity extends Activity {
    public static final String FILME = "filmesdb.usjt.br.filmesdb.controller.filme";
    public ArrayList<Filme> filmes;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        //Gerenciamento da activity atual
        activity = this;

        Intent intent = getIntent();

        String generoSelecionado = intent.getStringExtra(MainActivity.GENERO);

        //Busca filmes conforme o gênero selecionado no spinner na tela anterior
        filmes = buscaFilmes(generoSelecionado);

        //ListView personalizada com o adapter
        ListView listView = findViewById(R.id.lista_filmes);
        FilmeAdapter adapter = new FilmeAdapter(filmes, this);
        listView.setAdapter(adapter);

        //Observador do evento de clique na lista da tela
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Filme filme = filmes.get(i);
                Intent intent = new Intent(activity, DetalheFilmeActivity.class);
                intent.putExtra(FILME, filme);
                startActivity(intent);
            }
        });

    }

    private ArrayList<Filme> buscaFilmes(String genero){
        ArrayList<Filme> resultadoFilmes;

        if(genero != null && genero.length() > 0){
            resultadoFilmes = new ArrayList<>();
            ArrayList<Filme> lista = listaFilmes();
            for(Filme filme:lista){
                if(filme.getTitulo().toUpperCase().contains(genero.toUpperCase())){
                    resultadoFilmes.add(filme);
                }
            }
            return resultadoFilmes;
        } else {
            return listaFilmes();
        }
    }


    private ArrayList<Filme> listaFilmes(){
        return FilmeDAO.getFilmes();
    }

}
