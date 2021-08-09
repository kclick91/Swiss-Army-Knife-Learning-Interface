import java.io.IOException;

//Swiss Army Knife mental model applied to programming
public interface ILearning {
    void Store() throws IOException; //store in memory
    String ReturnData();//access the data
    void Synthesize(Object o, Object otwo); //synthesize
    void Decompose(Object o); //decompose an object
    void Link(Object O, Object o); //Link separate objects
    void Categorize(Object o); //Categorize objects
    void Detect(); //detect
    void Detect(Object o); //detect something specific
    void UnderstandConsequences(); //look ahead
    String ExplainEvents(); //explain how or why something happened
    String ExplainItself(); //explain how it made a decision
    void ImproveSelf(); //Improve it's own algorithm
    void Calculate(); //General calculation
    void Train(); //Practice, train on data, inputs
    void Train(Object o); //Practice with something specific
    void FindSimilarities(Object o, Object otwo); //find similarities
    void FindDifferences(Object o, Object otwo); //find differences
    String DefendDecision(Object o); //Hold its ground
    void UseIntuition(); //Up to you
    void Imagine(); //Represent a fictional input
    void Teach(); //Teach humans or other AI
    String FindInsight(); //Be insightful
    String FindBias(); //Detect and return a name of a bias
    String FindFallacy(); //Detect and return a name of a fallacy
    void SeekReward(); //Learn from rewards
    void AvoidPunishment(); //Learn to avoid punishment
    Object Translate(Object o); //Translate languages or anything in general
    String Name(); //Come up with a name for a concept
    int Rate(); //Grade, rate with numbers, stars, etc.
    String Conclude(String s); //Reason with input
    String TransferKnowledge(); //Transfer knowledge to another domain
    void PayAttentionTo(Object o); //Focus
    void Understand(Object o); //Works to store preparations for similar objects
    void Strategize(); //Strategy
    void UseTactic(Object tactic); //Tactics
    String WriteAlgorithm(); //Update code
    Boolean DoesUnderstand(Object o); //User checks if something is understood
    String GiveBigPicture(); //Think holistically
    Boolean ExpressABelief(String s); //Returns whether a statement is true or false
    int WeighOptions(Object firstOption, Object secondOption); //returns 0 for first or 1 for second OR anything that is preferred
    String[] BlackBox(String input, String output); //Reveals the outputs and inputs of black boxes
    String[] ScrambleMethodsHierarchically(); //Scramble and return the methods' levels in the hierarchy
    int AssignValue(Object o); //Assign numerical value to abstractions, successes, information,etc.
    void LearnorTeachByAnalogy(Object o, Object otwo); //Think with analogies
    void LearnByFirstPrinciples(Object o); //First Principles
    void PrintAll() throws IOException; //Print everything as everything or a summary
    String ExpressCuriosity(); //Place value on something without being programmed to value a specific thing








}
