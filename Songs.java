/*
 * Clase Songs
 * Desarrollado por el subgrupo A
 * author: Hugo Nieto Henriquez <> Copyright (C) BY-NC
 * author: Yassin Achengli <yassin_achengli@hotmail.com> Copyright (C) BY-NC
 *
 * Acceso a las canciones de la base de datos de forma estructurada.
 * Se realizan */
package musicapp;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * INMUTABLE 
 * Esta clase se debe usar sin ser modificada, es una clase estructura para ser usada
 * como contenedor de los datos de cada cancion.
 * 
 * Atributos de la estructura de datos:
 * - name: Titulo de la cancion
 * - author_name: Nombre del autor
 * - author_id: id del autor (opcional entre author_name y author_id)
 * - audio_path: localizacion del fichero multimedia de audio.
 * - logo_path: localizacion del logo de la cancion (multimedia de tipo imagen).
 * */
class Song extends HashMap<String, Object> {
  public Song(Integer song_id, String song_name, String audio_path, String logo_path, String author_name,
      Integer author_id){
    super.put("song_id", song_id);
    super.put("song_name", song_name);
    super.put("audio_path", audio_path);
    super.put("logo_path", logo_path);
    super.put("author_id", author_id);
    super.put("author_name", author_name);
  }

  public Song(Integer song_id, String song_name,  String audio_path, String logo_path, String author_name){
    this(song_id, song_name, audio_path, logo_path, author_name, null);
  }

  public Song(Integer song_id, String song_name, String audio_path, String logo_path){
    this(song_id, song_name, audio_path, logo_path, null, null);
  }
}

public class Songs {

  /*
   * Busqueda de canciones por su titulo en la base de datos.
   * Devuelve una lista de las canciones localizadas, en caso de ser 0 canciones devuelve un objeto 
   * ArrayList<Song>()
   * */
  public static ArrayList<Song> searchByName(String song_name) {
    return new ArrayList<Song>(); // TODO
  }

  /*
   * Busqueda de canciones por su autor en la base de datos.
   * Busca las canciones que tienen el mismo autor al que se pasa por parametro, hace una busqueda de
   * forma independiente respecto a las mayusculas y minusculas, ademas no se puede incluir tildes o
   * la enie.
   * Devuelve una lista de las canciones que se han encontrado.
   * */
  public static ArrayList<Song> searchByAuthor(String author_name){
    return new ArrayList<Song>(); // TODO
  }

  /*
   * Borra la cancion que se pasa por parametro de la base de datos.
   * Si la cancion ha sido localizada y borrada, entonces envia un true, en otro caso envia un false.
   * */
  public static Boolean deleteSongByName(String song_name){
    return false;
  }

   /*
   * Borra la cancion que se pasa por parametro de la base de datos.
   * Si la cancion ha sido localizada y borrada, entonces envia un true, en otro caso envia un false.
   * */
  public static Boolean deleteSongById(Integer song_id){
    return false;
  }
}
