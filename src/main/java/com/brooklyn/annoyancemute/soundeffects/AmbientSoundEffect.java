package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;

public class AmbientSoundEffect implements SoundEffect
{
	int id;
	SoundEffectType soundEffectType;
	int[] backgroundSoundEffects;

	public AmbientSoundEffect(int id, SoundEffectType soundEffectType)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.backgroundSoundEffects = new int[]{};
	}

	public AmbientSoundEffect(int id, SoundEffectType soundEffectType, int[] backgroundSoundEffects)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.backgroundSoundEffects = backgroundSoundEffects;
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
		return this.backgroundSoundEffects;
	}
}
