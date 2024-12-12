/*
 * clase Reports
 * Desarrollado por el subgrupo C
 * author: Jorge Ristori <> Copyright (C) BY-NC
 * author: Victor <> Copyright (C) BY-NC
 *
 * Administracion de las denuncias a un comentario dentro de la base de datos.
 * */
package musicapp;

import java.util.ArrayList;
import java.util.HashMap;

class Report extends HashMap<String, Integer> {
  public Report(Integer report_id,Integer user_id,Integer comment_id){
    super.put("report_id", report_id);
    super.put("user_id", user_id);
    super.put("comment_id", comment_id);
  }
}

public class Reports {

  public ArrayList<Report> getAllCommentReports(Integer comment_id){
    return new ArrayList<>();
  }

  public Integer countCommentReports(Integer comment_id){
    return 0;
  }

  public Boolean addCommentReport(Integer comment_id, Integer user_id, Integer report_id){
    return true;
  }
}
