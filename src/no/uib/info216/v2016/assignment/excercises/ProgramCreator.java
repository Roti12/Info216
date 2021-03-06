package no.uib.info216.v2016.assignment.excercises;

import no.uib.info216.v2016.assignment.SPARQLQueries.QueryItems;
import no.uib.info216.v2016.assignment.SPARQLQueries.strings.QueryStrings;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 117, 103 on 18.05.2016.
 */
public class ProgramCreator {

    private List<Exercise> monday = null;
    private List<Exercise> tuesday = null;
    private List<Exercise> wednesday = null;
    private List<Exercise> thursday = null;
    private List<Exercise> friday = null;
    private List<Exercise> saturday = null;
    private List<Exercise> sunday = null;


    private int LEVEL = 0;

    public class WORKOUT {
        public static final int LEVEL_1 = 0;
        public static final int LEVEL_2 = 1;
        public static final int LEVEL_3 = 2;
        public static final int LEVEL_4 = 3;
        public static final int LEVEL_5 = 4;
        public static final int LEVEL_6 = 5;
        public static final int LEVEL_7 = 6;
    }

    public ProgramCreator() {
        monday = new ArrayList<>();
        tuesday = new ArrayList<>();
        wednesday = new ArrayList<>();
        thursday = new ArrayList<>();
        friday = new ArrayList<>();
        saturday = new ArrayList<>();
        sunday = new ArrayList<>();

    }
    /* less than six months
    Quads – squats, lunges, one legged squats, box jumps.
     Butt and Hamstrings – hip raises, deadlifts, straight leg deadlifts, good mornings, step ups.
     Push (chest, shoulders, and triceps) – overhead press, bench press, incline dumbbell press, push ups, dips.
     Pull (back, biceps, and forearms) – chin ups, pull ups, inverse body weight rows, dumbbell rows.
     Core (abs and lower back) – planks, side planks, exercise ball crunches, mountain climbers, jumping knee tucks, hanging leg raises.
     Pick one exercise from each category above for a workout, and you’ll work almost every single muscle in your body.
     These are just a few examples for what you can do, but you really don’t need to make things more complicated than this.
     */

    // E
        //Q
            //U
                //I
                    //P
                        //M
                            //E
                                //N
                                    //T





    public void create(int LEVEL) {
        clear();
        setLEVEL(LEVEL);

        //Create the days
        createMonday();
        createTuesday();
        createWednesday();
        createThursday();
        createFriday();
        createSaturday();
        createSunday();
    }

    private void clear() {
        monday.clear();
        tuesday.clear();
        wednesday.clear();
        thursday.clear();
        friday.clear();
        saturday.clear();
        sunday.clear();
    }

    private void createMonday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:
                monday.add(getSquat());
                monday.add(getDeadlift());
                monday.add(getBenchPress());
                monday.add(getCableRow());
                monday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_2:
                break;
            case WORKOUT.LEVEL_3:
                break;
            case WORKOUT.LEVEL_4:
                break;
            case WORKOUT.LEVEL_5:
                monday.add(getBicepCurl());
                monday.add(getOverheadPress());
                monday.add(getBenchPress());
                break;
            case WORKOUT.LEVEL_6:
                monday.add(getSquat());
                monday.add(getDeadlift());
                monday.add(getBenchPress());
                monday.add(getOverheadPress());
                monday.add(getBicepCurl());
                break;
            case  WORKOUT.LEVEL_7:
                monday.add(getSquat());
                monday.add(getDeadlift());
                monday.add(getCableRow());
                monday.add(getBicepCurl());
                monday.add(getBenchPress());
                break;
        }

    }

    private void createTuesday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:
                break;
            case WORKOUT.LEVEL_2:
                tuesday.add(getSquat());
                tuesday.add(getDeadlift());
                tuesday.add(getBenchPress());
                tuesday.add(getCableRow());
                tuesday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_3:
                tuesday.add(getOverheadPress());
                tuesday.add(getBenchPress());
                tuesday.add(getTricepExtension());
                tuesday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_4:
                tuesday.add(getBicepCurl());
                tuesday.add(getCableRow());
                tuesday.add(getSquat());
                tuesday.add(getDeadlift());
                break;
            case WORKOUT.LEVEL_5:
                tuesday.add(getSquat());
                tuesday.add(getDeadlift());
                tuesday.add(getTricepExtension());
                tuesday.add(getCableRow());
                break;
            case WORKOUT.LEVEL_6:
                tuesday.add(getSquat());
                tuesday.add(getCableRow());
                tuesday.add(getDeadlift());
                tuesday.add(getOverheadPress());
                tuesday.add(getBicepCurl());
                break;
            case  WORKOUT.LEVEL_7:
                tuesday.add(getTricepExtension());
                tuesday.add(getOverheadPress());
                tuesday.add(getBenchPress());
                tuesday.add(getBicepCurl());
                break;
        }


    }

    private void createWednesday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:
                wednesday.add(getSquat());
                wednesday.add(getDeadlift());
                wednesday.add(getBenchPress());
                wednesday.add(getCableRow());
                wednesday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_2:
                break;
            case WORKOUT.LEVEL_3:
                break;
            case WORKOUT.LEVEL_4:
                wednesday.add(getBenchPress());
                wednesday.add(getOverheadPress());
                wednesday.add(getBicepCurl());
                wednesday.add(getTricepExtension());
                break;
            case WORKOUT.LEVEL_5:
                wednesday.add(getCableRow());
                wednesday.add(getDeadlift());
                wednesday.add(getSquat());
                wednesday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_6:
                wednesday.add(getCableRow());
                wednesday.add(getDeadlift());
                wednesday.add(getBicepCurl());
                wednesday.add(getBenchPress());
                wednesday.add(getTricepExtension());
                break;
            case  WORKOUT.LEVEL_7:
                wednesday.add(getDeadlift());
                wednesday.add(getSquat());
                wednesday.add(getCableRow());
                wednesday.add(getBicepCurl());
                break;
        }


    }

    private void createThursday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:

                break;
            case WORKOUT.LEVEL_2:
                thursday.add(getSquat());
                thursday.add(getDeadlift());
                thursday.add(getBenchPress());
                thursday.add(getCableRow());
                thursday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_3:
                thursday.add(getSquat());
                thursday.add(getDeadlift());
                thursday.add(getBenchPress());
                thursday.add(getCableRow());
                thursday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_4:
                thursday.add(getSquat());
                thursday.add(getDeadlift());
                thursday.add(getCableRow());
                thursday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_5:
                break;
            case WORKOUT.LEVEL_6:
                thursday.add(getSquat());
                thursday.add(getBenchPress());
                thursday.add(getDeadlift());
                thursday.add(getTricepExtension());
                break;
            case  WORKOUT.LEVEL_7:
                thursday.add(getBenchPress());
                thursday.add(getOverheadPress());
                thursday.add(getTricepExtension());
                thursday.add(getBicepCurl());
                break;

        }


    }

    private void createFriday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:
                friday.add(getSquat());
                friday.add(getDeadlift());
                friday.add(getBenchPress());
                friday.add(getCableRow());
                friday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_2:
                break;
            case WORKOUT.LEVEL_3:
                friday.add(getSquat());
                friday.add(getDeadlift());
                friday.add(getBenchPress());
                friday.add(getCableRow());
                friday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_4:
                break;
            case WORKOUT.LEVEL_5:
                friday.add(getBenchPress());
                friday.add(getSquat());
                friday.add(getTricepExtension());
                friday.add(getOverheadPress());
                break;
            case WORKOUT.LEVEL_6:
                friday.add(getBicepCurl());
                friday.add(getOverheadPress());
                friday.add(getBenchPress());
                friday.add(getDeadlift());
                break;
            case  WORKOUT.LEVEL_7:
                friday.add(getDeadlift());
                friday.add(getSquat());
                friday.add(getCableRow());
                friday.add(getBicepCurl());
                friday.add(getTricepExtension());
                break;
        }

    }

    private void createSaturday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:
                break;
            case WORKOUT.LEVEL_2:
                saturday.add(getSquat());
                saturday.add(getDeadlift());
                saturday.add(getBenchPress());
                saturday.add(getCableRow());
                saturday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_3:
                break;
            case WORKOUT.LEVEL_4:
                saturday.add(getSquat());
                saturday.add(getDeadlift());
                saturday.add(getCableRow());
                saturday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_5:
                break;
            case WORKOUT.LEVEL_6:
                break;
            case  WORKOUT.LEVEL_7:
                saturday.add(getBenchPress());
                saturday.add(getSquat());
                saturday.add(getOverheadPress());
                saturday.add(getTricepExtension());
                saturday.add(getBicepCurl());
                break;
        }

    }

    private void createSunday() {
        switch (LEVEL) {
            case WORKOUT.LEVEL_1:

                break;
            case WORKOUT.LEVEL_2:
                break;
            case WORKOUT.LEVEL_3:
                sunday.add(getSquat());
                sunday.add(getDeadlift());
                sunday.add(getBenchPress());
                sunday.add(getBicepCurl());
                break;
            case WORKOUT.LEVEL_4:
                break;
            case WORKOUT.LEVEL_5:
                sunday.add(getDeadlift());
                sunday.add(getCableRow());
                sunday.add(getBicepCurl());
                sunday.add(getOverheadPress());
                break;
            case WORKOUT.LEVEL_6:
                sunday.add(getSquat());
                sunday.add(getDeadlift());
                sunday.add(getCableRow());
                sunday.add(getBicepCurl());
                break;
            case  WORKOUT.LEVEL_7:

                break;
        }

    }

    private Exercise getSquat() {
        //	System.out.println("Hello, you have pressed a button");
        ResultSet result = QueryItems.queryOntology( QueryStrings.querySquat);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;
        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();
            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {
                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            label = binding.getLiteral("label");

            Resource tempUse = null;
            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }
        return new Exercise("Squats", label, equipment, can_useList, muscles);

    }

    private Exercise getDeadlift() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryDeadlift);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;
        while (result.hasNext()) {
            //ResultSetFormatter.out(result);
            QuerySolution binding = result.nextSolution();

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            label = binding.getLiteral("label");

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Deadlift", label, equipment, can_useList, muscles);


    }

    private Exercise getBenchPress() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryBenchPress);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;
       // ResultSetFormatter.out(result);

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            label = binding.getLiteral("label");

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Bench Press", label, equipment, can_useList, muscles);


    }

    private Exercise getTricepExtension() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryTricepExtension);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            Resource tempUse = null;
            label = binding.getLiteral("label");

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Tricep Extension", label, equipment, can_useList, muscles);

    }

    private Exercise getOverheadPress() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryOverheadPress);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            label = binding.getLiteral("label");

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Overhead Press", label, equipment, can_useList, muscles);
    }

    private Exercise getCableRow() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryBentOverRow);
        List<Resource> muscles = new ArrayList<>();
        List<Resource> can_useList = new ArrayList<>();

        Resource equipment = null;
        Literal label = null;
        Resource can_use = null;

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }
            equipment = (Resource) binding.get("Required_Equipment");
            label = binding.getLiteral("label");

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Bent-Over Row", label, equipment, can_useList, muscles);
    }


    private Exercise getBicepCurl() {
        ResultSet result = QueryItems.queryOntology( QueryStrings.queryBicepCurl);
        List<Resource> can_useList = new ArrayList<>();
        List<Resource> muscles = new ArrayList<>();
        Literal label = null;
        Resource can_use;
        while (result.hasNext()) {

            // ResultSetFormatter.out(result);
            QuerySolution binding = result.nextSolution();
            label = binding.getLiteral("label");

            Resource muscle = (Resource) binding.get("Muscles");
            if (!muscles.contains(muscle)) {

                muscles.add(muscle);
            }

            can_use = (Resource) binding.get("Equipment");
            if (!can_useList.contains(can_use)) {

                can_useList.add(can_use);
            }

        }

        return new Exercise("Bicep Curls", label, null, can_useList, muscles);
    }


    public Equipment getOlympiaBar() {

        ResultSet result = QueryItems.queryOntology(QueryStrings.queryOlympiaBar);
        List<Resource> is_used_in = new ArrayList<>();

        //Literal label = null;
        Literal weight = null;

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource exercise = (Resource) binding.get("Exercises");
            if (!is_used_in.contains(exercise)) {
                is_used_in.add(exercise);
            }
            weight = binding.getLiteral("weight");
        }

        return new Equipment("Test", is_used_in, null, weight);

    }

    public Equipment getBenchRack() {

        ResultSet result = QueryItems.queryOntology(QueryStrings.queryOlympiaBar);
        List<Resource> is_used_in = new ArrayList<>();

        Literal label = null;
        Literal weight = null;

        while (result.hasNext()) {
            QuerySolution binding = result.nextSolution();

            Resource exercise = (Resource) binding.get("Exercises");
            if (!is_used_in.contains(exercise)) {
                is_used_in.add(exercise);
            }
            weight = binding.getLiteral("weight");
            label = binding.getLiteral("label");
        }

        return new Equipment("Test", is_used_in, label, weight);

    }


    public int getLEVEL() {
        return LEVEL;
    }

    public void setLEVEL(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    public List<Exercise> getSunday() {
        return sunday;
    }

    public List<Exercise> getMonday() {
        return monday;
    }

    public List<Exercise> getTuesday() {
        return tuesday;
    }

    public List<Exercise> getWednesday() {
        return wednesday;
    }

    public List<Exercise> getThursday() {
        return thursday;
    }

    public List<Exercise> getFriday() {
        return friday;
    }

    public List<Exercise> getSaturday() {
        return saturday;
    }

}
