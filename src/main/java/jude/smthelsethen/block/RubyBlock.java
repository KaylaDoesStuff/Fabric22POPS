package jude.smthelsethen.block;

import net.minecraft.block.Block;

public class RubyBlock extends Block {

    public RubyBlock(Settings settings) {
        super(settings);
    }

    public float strength = 4.0f;

    public static float getStrength(float strength) {
        return strength;
    }
}
