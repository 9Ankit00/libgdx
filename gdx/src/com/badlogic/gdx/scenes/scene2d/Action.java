/*
 * Copyright 2010 Mario Zechner (contact@badlogicgames.com), Nathan Sweet (admin@esotericsoftware.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.badlogic.gdx.scenes.scene2d;

/**
 * An Action is used with an {@link Actor} and modifes the Actor's attributes over time.
 * 
 * @author mzechner
 * 
 */
public interface Action {
	/**
	 * Sets the {@link Actor} of this action. Will be called when the Action is added to an Actor via {@link Actor#action(Action)}
	 * before any other call to this interface.
	 * 
	 * @param actor the actor.
	 */
	public void setTarget (Actor actor);

	/**
	 * Apply the action.
	 * 
	 * @param delta delta time in seconds
	 */
	public void act (float delta);

	/**
	 * @return whether the action is done or not
	 */
	public boolean isDone ();

	/**
	 * Called by the owner of the action when it can release all its resources, e.g. put itself back into a pool.
	 */
	public void finish ();

	/**
	 * Creates a copy of this action. The action must be in a state independent of the original and one must be able to call
	 * {@link #setTarget(Actor)} on it without any side effects.
	 */
	public Action copy ();
}
