/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.citec.csra.highlight.tgt;

import static rst.hri.HighlightTargetType.HighlightTarget.Modality.*;

/**
 *
 * @author Patrick Holthaus
 * (<a href=mailto:patrick.holthaus@uni-bielefeld.de>patrick.holthaus@uni-bielefeld.de</a>)
 */
public class DefaultTargets {

	public static void load() {

		TargetConfig tv = new TargetConfig();
		tv.setDescription(AMBIENT_LIGHT, "Llamp6").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "335,70");

		TargetConfig entrance = new TargetConfig();
		entrance.setDescription(AMBIENT_LIGHT, "Hallway_0").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "84,33");

		TargetConfig surface = new TargetConfig();
		surface.setDescription(AMBIENT_LIGHT, "").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "220,90");

		TargetConfig zen = new TargetConfig();
		zen.setDescription(AMBIENT_LIGHT, "Slamp2").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "290,60");

		TargetConfig plant = new TargetConfig();
		plant.setDescription(AMBIENT_LIGHT, "Slamp2").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "194,74");

		TargetConfig flobi = new TargetConfig();
		flobi.setDescription(AMBIENT_LIGHT, "Hallway_0").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "");

		TargetConfig meka = new TargetConfig();
		meka.setDescription(AMBIENT_LIGHT, "Hallway_0").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "140,60");

		TargetConfig cupboard1 = new TargetConfig();
		cupboard1.setDescription(AMBIENT_LIGHT, "503").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "117,31");

		TargetConfig cupboard2 = new TargetConfig();
		cupboard2.setDescription(AMBIENT_LIGHT, "505").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "109,28");

		TargetConfig drawer1 = new TargetConfig();
		drawer1.setDescription(AMBIENT_LIGHT, "502").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "114,45");

		TargetConfig drawer2 = new TargetConfig();
		drawer2.setDescription(AMBIENT_LIGHT, "507").
				setDescription(GAZE, "120,120").
				setDescription(GESTURE, "120,120").
				setDescription(SOUND, "Waikiki.ogg").
				setDescription(SPOT_LIGHT, "114,45");

		TargetMap.register(Target.TV, tv);
		TargetMap.register(Target.Entrance, entrance);
		TargetMap.register(Target.Surface, surface);
		TargetMap.register(Target.Plant, plant);
		TargetMap.register(Target.Flobi, flobi);
		TargetMap.register(Target.Meka, meka);
		TargetMap.register(Target.Zen, plant);
		TargetMap.register(Target.cupboard1, cupboard1);
		TargetMap.register(Target.cupboard2, cupboard2);
		TargetMap.register(Target.drawer1, drawer1);
		TargetMap.register(Target.drawer2, drawer2);
	}

}
