
// METABOLISM_RATING_FAST : double		// default value .75
// METABOLISM_RATING_MEDIUM : double		// default value .50
// METABOLISM_RATING_SLOW : double		// default value .15
//
// eat() : void					//notice the method is italicized - it is an abstract method
// eat(Food f) : void				//notice the method is italicized - it is an abstract method
// metabolizeFood(Food f) : double	//notice the method is italicized - it is an abstract method

public interface FoodEater {
  public static final double METABOLISM_RATING_FAST = .75;
  public static final double METABOLISM_RATING_MEDIUM = .50;
  public static final double METABOLISM_RATING_SLOW = .15;

  void eat();

  void eat(Food f);

  double metabolizeFood(Food f);
}
