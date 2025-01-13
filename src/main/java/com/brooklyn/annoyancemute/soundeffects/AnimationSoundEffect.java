package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;

public class AnimationSoundEffect implements SoundEffect
{

	int id;
	SoundEffectType soundEffectType;
	int[] animationID;

	public AnimationSoundEffect(int id, SoundEffectType soundEffectType, int animationID)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.animationID = new int[] {animationID};
	}

	public AnimationSoundEffect(int id, SoundEffectType soundEffectType)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.animationID = new int[] {-1};
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
		return this.animationID;
	}
}
