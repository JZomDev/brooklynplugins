package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;

public class ActorCombatSoundEffect implements SoundEffect
{

	int id;
	SoundEffectType soundEffectType;
	int[] actorCombatLevel;

	public ActorCombatSoundEffect(int id, SoundEffectType soundEffectType, int actorCombatLevel)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.actorCombatLevel = new int[] {actorCombatLevel};
	}

	public ActorCombatSoundEffect(int id, SoundEffectType soundEffectType)
	{
		this.id = id;
		this.soundEffectType = soundEffectType;
		this.actorCombatLevel = null;
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
		return this.actorCombatLevel;
	}
}
