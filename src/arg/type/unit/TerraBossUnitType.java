package arg.type.unit;

import arc.math.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.world.meta.*;
import arg.content.deterra.DeterraItems;
import arg.graphics.*;
import arg.content.*;
import mindustry.entities.abilities.*;
import arg.content.deterra.blocks.*;
import arg.world.blocks.environment.*;

// The kings
public class TerraBossUnitType extends UnitType{

    public TerraBossUnitType(String name){
        super(name);
        outlineColor = GenesisPal.terraEonstoneOutline;
        envDisabled = Env.none;
        drawCell = false;
        useUnitCap = false;
        lightRadius = 0;
        engineSize = 0;
        abilities.add(new LiquidExplodeAbility(){{
            liquid = GenesisLiquids.biomass;
        }});

        healFlash = false;
    }
}
