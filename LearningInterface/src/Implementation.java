import java.io.FileWriter;
import java.io.IOException;

public class Implementation implements ILearning {
    //Augmenting the reading/studying of a history book
    private String name = "History_Book_Augmentation";
    public Implementation()
    {

    }
    public Implementation(String n)
    {
        name = n;
    }
    //Variables
    //These are the private variables for
    //the Implementation class
    //Example:
    String description;
    //Continue with private variables
    @Override
    public void Store() throws IOException {
        //store in memory
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Summary of History Book.");
        myWriter.close();
    }

    @Override
    public void Synthesize(Object o, Object otwo) {
        //take common features from o and otwo


    }

    @Override
    public void Decompose(Object o) {
        //Break down an object from any information one has on that object
    }

    @Override
    public void Link(Object O, Object o) {
        //Find a connection between two values, two words etc.
    }

    @Override
    public void Categorize(Object o) {
        //Place in already determined categories
    }

    @Override
    public void Detect() {
        //Detection(General)
    }

    @Override
    public void Detect(Object o) {
        //Detect o
    }

    @Override
    public void UnderstandConsequences() {
        //Think ahead
    }

    @Override
    public String ExplainEvents() {
        //Explain an event
        return null;
    }

    @Override
    public String ExplainItself() {
        //Explain its own decisions
        return null;
    }

    @Override
    public void ImproveSelf() {
        //Improve anything that improves itself
        //Includes requests to human programmers/users

    }

    @Override
    public void Calculate() {
        //General calculations, similar to understanding consequences but more exact


    }

    @Override
    public void Train() {
        //Use data and inputs to train
    }

    @Override
    public void Train(Object o) {
        //Train with the use of o

    }

    @Override
    public void FindSimilarities(Object o, Object otwo) {
        //Find any similarites in o and otwo connected to this class
    }

    @Override
    public void FindDifferences(Object o, Object otwo) {
        //Find any differences in o and otwo connected to this class
    }

    @Override
    public String DefendDecision(Object o) {
        //argumentative skills go here
        return null;
    }

    @Override
    public void UseIntuition() {
        //This can be used very loosely
    }

    @Override
    public void Imagine() {
        //Work with fictional data or inputs
    }

    @Override
    public void Teach() {
        //Teach itself, other computer/AI, or humans

    }

    @Override
    public String FindInsight() {
        //Find two or more interesting things about the same things
        //Other ways to use this function
        return null;
    }

    @Override
    public String FindBias() {
        //Detect bias in decisions
        return null;
    }

    @Override
    public String FindFallacy() {
        //detect logical fallacies in anything
        return null;
    }

    @Override
    public void SeekReward() {
        //Improvements from reinforcement learning

    }

    @Override
    public void AvoidPunishment() {
        //learns to avoid punishment and returns
        //actions here
    }

    @Override
    public Object Translate(Object o) {
        //translate languages or anything else
        return null;
    }

    @Override
    public String Name() {
        //Name new concepts or identify something
        return null;
    }

    @Override
    public int Rate() {
        //Judge or rate something
        return 0;
    }

    @Override
    public String Conclude(String s) {
        //Reasoning goes here
        return null;
    }

    @Override
    public String TransferKnowledge() {
        //Transfer knowledge from different datasets, etc..
        return null;
    }

    @Override
    public void PayAttentionTo(Object o) {
        //Return information about o in a process, game, sequence of events

    }

    @Override
    public void Understand(Object o) {
        //Anything determined as understanding
    }

    @Override
    public void Strategize() {
        //Think of a strategy
    }

    @Override
    public void UseTactic(Object tactic) {
        //Use tactics to support Strategy
    }

    @Override
    public String WriteAlgorithm() {
        //Specifically write an algorithm to improve itself
        return null;
    }

    @Override
    public Boolean DoesUnderstand(Object o) {
        //Checks for understanding
        return null;
    }

    @Override
    public String GiveBigPicture() {
        //Thinks of the big picture
        return null;
    }

    @Override
    public Boolean ExpressABelief(String s) {
        //Returns a strong summary of s
        return null;
    }

    @Override
    public int WeighOptions(Object firstOption, Object secondOption) {
        //Weight two options
        return 0;
    }

    @Override
    public String[] ScrambleMethodsHierarchically() {
        return new String[0];
    }

    @Override
    public String[] BlackBox(String input, String output) {
        return new String[0];
    }

    @Override
    public int AssignValue(Object o) {
        return 0;
    }

    @Override
    public void LearnorTeachByAnalogy(Object o, Object otwo) {

    }

    @Override
    public void LearnByFirstPrinciples(Object o) {

    }

    @Override
    public String ExpressCuriosity() {
        return null;
    }

    @Override
    public void PrintAll() throws IOException {
        //System.out.println();
        Implementation imp = new Implementation();
        imp.Store(); //store in memory
        imp.Synthesize(new Object(), new Object()); //synthesize
        imp.Decompose(new Object()); //decompose an object
        imp.Link(new Object(), new Object()); //Link separate objects
        imp.Categorize(new Object()); //Categorize objects
        imp.Detect(); //detect
        imp.Detect(new Object()); //detect something specific
        imp.UnderstandConsequences(); //look ahead
        imp.ExplainEvents(); //explain how or why something happened
        imp.ExplainItself(); //explain how it made a decision
        imp.ImproveSelf(); //Improve it's own algorithm
        imp.Calculate(); //General calculation
        imp.Train(); //Practice, train on data, inputs
        imp.Train(new Object()); //Practice with something specific
        imp.FindSimilarities(new Object(), new Object()); //find similarities
        imp.FindDifferences(new Object(), new Object()); //find differences
        imp.DefendDecision(new Object()); //Hold its ground
        imp.UseIntuition(); //Up to you
        imp.Imagine(); //Represent a fictional input
        imp.Teach(); //Teach humans or other AI
        imp.FindInsight(); //Be insightful
        imp.FindBias(); //Detect and return a name of a bias
        imp.FindFallacy(); //Detect and return a name of a fallacy
        imp.SeekReward(); //Learn from rewards
        imp.AvoidPunishment(); //Learn to avoid punishment
        imp.Translate(new Object()); //Translate languages or anything in general
        imp.Name(); //Come up with a name for a concept
        imp.Rate(); //Grade, rate with numbers, stars, etc.
        imp.Conclude(new String()); //Reason with input
        imp.TransferKnowledge(); //Transfer knowledge to another domain
        imp.PayAttentionTo(new Object()); //Focus
        imp.Understand(new Object()); //Works to store preparations for similar objects
        imp.Strategize(); //Strategy
        imp.UseTactic(new Object()); //Tactics
        imp.WriteAlgorithm(); //Update code
        imp.DoesUnderstand(new Object()); //User checks if something is understood
        imp.GiveBigPicture(); //Think holistically
        imp.ExpressABelief(new String()); //Returns whether a statement is true or false
        imp.WeighOptions(new Object(), new Object()); //returns 0 for first or 1 for second OR anything that is preferred
        imp.BlackBox(new String(), new String()); // Understand black boxes
        imp.ScrambleMethodsHierarchically();//Scramble the levels of hierarchy, In F(G()) F is higher in the hierarchy.
        imp.AssignValue(new Object());//Assigns value to something
        imp.LearnorTeachByAnalogy(new Object(), new Object()); //Think with analogies
        imp.LearnByFirstPrinciples(new Object()); //Think with First Principles
        imp.ExpressCuriosity(); //Value knowing something without being programmed to value that specific thing

    }
}
