package project.com;

import java.util.ArrayList;
import java.util.List;

public class NutritionPlanDirector {
    private NutritionPlanBuilder np;

    public void setBuilder(NutritionPlanBuilder np){
        this.np = np;
    }

    public void createNutritionPlan(){
        np.build();
    }

}
