package project.com;

import java.util.List;

public class NutritionPlan {
    private int dailyCaloricIntake;
    private int carb;
    private int prot;
    private int fat;
    private List<String> mealPlan;
    private String fitnesGoal;               //"weight loss", "weight gain", "maintenance"
    private List<String> dietaryRestr;   //"gluten-free", "vegan", "lactose-free")

    public NutritionPlan(int dailyCaloricIntake, int carb, int prot, int fat, List<String> mealPlan, String fitnesGoal, List<String> dietaryRestr) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.carb = carb;
        this.prot =prot;
        this.fat = fat;
        this.mealPlan =mealPlan;
        this.fitnesGoal = fitnesGoal;
        this.dietaryRestr =dietaryRestr;
    }
    public int getDailyCaloricIntake(){
        return this.dailyCaloricIntake;
    }

    public static void main(String[] args){
        WeightGainNutritionPlanBuilder npb = new WeightGainNutritionPlanBuilder();
        NutritionPlanDirector d = new NutritionPlanDirector();
        d.setBuilder(npb);
        d.createNutritionPlan();

        NutritionPlan nplan = npb.build();

        System.out.println(nplan.getDailyCaloricIntake());

    }
}
