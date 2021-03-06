package safemeeting.model;

/**
 * Classe usata per settare un nuovo messaggio per l'assenza nel db.
 * @author Emilio Mainardi
 * @author Donato Marmora
 * @author Luca Di Chiara
 */

public class MessaggioBean {

  private String messaggioEmailStud;
  private String messaggioMatricolaDoc;
  private String messaggio;


  /**
   * Questo � un costruttore vuoto che inizializza l'oggetto messaggio.
   */
  public MessaggioBean() {

  }

  /**
   * Questo metodo serve per prendere l'email dello studente.
   * 
   * @return messaggioEmailStud (Email studente)
   */
  public String getMessaggioEmailStud() {
    return messaggioEmailStud;
  }

  /**
   * Questo metodo serve per settare l'email dello studente.
   * 
   * @param messaggioEmailStud (Email studente)
   */
  public void setMessaggioEmailStud(String messaggioEmailStud) {
    this.messaggioEmailStud = messaggioEmailStud;
  }

  /**
   * Questo metodo serve per prendere la matricola del docente.
   * 
   * @return messaggioMatricolaDoc (Matricola docente);
   */
  public String getMessaggioMatricolaDoc() {
    return messaggioMatricolaDoc;
  }

  /**
   * Questo metodo serve per settare la matricola del docente.
   * 
   * @param messaggioMatricolaDoc (Matricola docente)
   */
  public void setMessaggioMatricolaDoc(String messaggioMatricolaDoc) {
    this.messaggioMatricolaDoc = messaggioMatricolaDoc;
  }

  /**
   * Questo metodo serve per prendere il messaggio per indicare l'assenza.
   * 
   * @return messaggio (String messaggio)
   */
  public String getMessaggio() {
    return messaggio;
  }

  /**
   * Questo metodo serve per settare il messaggio.
   * 
   * @param messaggio (String)
   */
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }

}
