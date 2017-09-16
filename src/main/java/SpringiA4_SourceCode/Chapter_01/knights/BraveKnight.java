package SpringiA4_SourceCode.Chapter_01.knights;

//Chapter1 Spring之旅, 程序1.3
public class BraveKnight implements Knight {
	private Quest quest;

	//不同于之前的DamselRescuingKnight，BraveKnight是在构造的时候把探险任务作为构造器参数传入。
	//这是依赖注入的一种方式，即构造器注入。
	//更重要的是，传入的探险类型是Quest，所有探险任务都必须实现的接口，所以BraveKnight能够响应任意的Quest实现。
	public BraveKnight(Quest quest) { // Quest 被注入进来
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}
