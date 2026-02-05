package h04.strategy;

/**
 * This is the interface MoveStrategyWithCounter, which is a part of MoveStrategy and gives a result a int
 */
public interface MoveStrategyWithCounter extends MoveStrategy{
    /**
     * this interface will be a int with no parameters, the method will count the amount of moves
     * @return the result it will return at the end
     */
    int getMoveCount();

}
