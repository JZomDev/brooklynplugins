package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;

public class GenericSoundEffect implements SoundEffect
{
	int id;
	SoundEffectType soundEffectType;
	int[] modifier;

	public GenericSoundEffect(int id, SoundEffectType soundEffectType)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.modifier = new int[]{-1};
	}
	@Override
	public int getId()
	{
		return this.id;
	}

	@Override
	public SoundEffectType getSoundEffectType()
	{
		return this.soundEffectType;
	}

	@Override
	public int[] getModifier()
	{
		return this.modifier;
	}
}
