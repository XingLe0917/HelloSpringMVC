package SpringiA4_SourceCode.Chapter_01.knights;

// Chapter1 Spring之旅, 程序1.2
public class DamselRescuingKnight implements Knight{

	private RescueDamselQuest quest;

	  public DamselRescuingKnight() {
	    this.quest = new RescueDamselQuest();	//与RescueDamselQuest紧耦合
	  }

	  public void embarkOnQuest() {
	    quest.embark();
	  }

}
