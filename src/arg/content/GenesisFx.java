package arg.content;

import arc.Core;
import arc.graphics.Color;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.Vec2;
import arc.util.Time;
import mindustry.entities.Effect;
import mindustry.gen.Bullet;
import mindustry.graphics.*;
import arg.graphics.GenesisPal;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.randLenVectors;

public class GenesisFx{
    public static final Effect
    bulbPop = new Effect(10f, 80f, e -> {
        color(GenesisPal.terraPurple, GenesisPal.terraPurple, e.fin());
        stroke(e.fout() * 3f);
        Lines.circle(e.x, e.y, e.fin() * 32f);
    });
}