package coco;

public class Decoder{
  private String word;
  private String code;

  public void decode(){
    this.code = word.toUpperCase();
  }

  public Decoder(String w){
    this.word = w;
  }

  public String getCode(){
    return code;
  }
}
