package filmesdb.usjt.br.filmesdb.model;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;
import java.text.Normalizer;

import filmesdb.usjt.br.filmesdb.R;

public class Util {

    //Para poster do filme
    public static Drawable getDrawable(Context context, int idFilme){
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getField("filme"+Integer.toString(idFilme));
            int id = idField.getInt(idField);
            Drawable imagem = context.getResources().getDrawable(id, null);
            return imagem;
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

        return context.getResources().getDrawable(R.drawable.movie_padrao);
    }

    //Para gênero
    public static Drawable getDrawable(Context context, String genero){
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getField(retiraEspacosGenero(genero));
            int id = idField.getInt(idField);
            Drawable imagem = context.getResources().getDrawable(id, null);
            return imagem;
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

        return context.getResources().getDrawable(R.drawable.movie_padrao);
    }

    public static String retiraEspacosGenero(String genero){
        genero = genero.toLowerCase().replace(' ', '_');
        return removeCaracterEspecial(genero.replace('.', '_'));
    }

    public static String removeCaracterEspecial(String genero){
        return Normalizer.normalize(genero, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
