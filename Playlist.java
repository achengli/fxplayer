/*
 * clase Playlist
 * Desarrollado por el subgrupo B
 * author: Carlos Calafat <> Copyright (C) BY-NC
 * author: Fco. Javier Franco <> Copyright (C) BY-NC
 *
 * Administracion de las playlist de canciones dentro de la base de datos. 
 * */
package musicapp;

import java.util.HashMap;
import java.util.ArrayList;

public class Playlist {
  private Integer id = 0;
  private String user = "";
  private String plist_name = "";
  private Integer duration = 0;

  /* Obtiene las canciones de una playlist pasada por argumento
   */
  public static ArrayList<Song> getPlaylistSongs(String plist_name){
    return new ArrayList<>(); // TODO
  }

  /* Obtiene las playlist de un usuario concreto
   */
  public static ArrayList<Playlist> getUserPlaylists(User user){
    return new ArrayList<>(); // TODO
  }
  
  /* Obtiene la duracion de una playlist.
   */
  public Integer getDuration(Playlist plist){
    return duration; // TODO
  }

  /* Crea una playlist vacia para un usuario dado
   */
  public static Boolean createPlaylist(User user, Playlist plist){
    return false; // TODO
  }
}
