/*
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2017. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.turtle.core;

import dan200.computercraft.api.turtle.TurtleSide;
import dan200.computercraft.api.turtle.TurtleVerb;

import java.util.Optional;

public class TurtleAttackCommand extends TurtleToolCommand
{
    public TurtleAttackCommand( InteractDirection direction, Optional<TurtleSide> side )
    {
        super( TurtleVerb.Attack, direction, side );
    }
}
