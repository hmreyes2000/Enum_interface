package enum_interface;

public class TestHarness {
	
	Seasons seasons;
	SeasonalActivities sA = new SeasonalActivitiesImpl();
	public static void main(String[] args) {
		TestHarness examen = new TestHarness();
		
		examen.temporada(Seasons.SPRING);
		examen.temporada(Seasons.SUMMER);
		examen.temporada(Seasons.AUTUMN);
		examen.temporada(Seasons.WINTER);
		

	}
	public void temporada(Seasons seasons) {
		
		switch(seasons) {
		
		case SPRING:
            sA.HuntEasterEggs();
            break;              
        case SUMMER:
            sA.GoSunBathing();
            break;
                     
        case AUTUMN: 
        	sA.ApplePicking();
            break;
        case WINTER:
        	sA.SkiingInSnow();
        	break;                  
        default:
            System.out.println("Pick a season");
            break;
		
		}
		
	}

}
