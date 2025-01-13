package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;

public interface SoundEffect
{
	int getId();
	SoundEffectType getSoundEffectType();
	int[] getModifier();
}
