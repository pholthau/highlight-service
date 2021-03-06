/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.citec.csra.highlight.cfg;

import static de.citec.csra.highlight.cfg.Configurable.Stage.EXEC;
import static de.citec.csra.highlight.cfg.Configurable.Stage.INIT;
import static de.citec.csra.highlight.cfg.Configurable.Stage.PREPARE;
import static de.citec.csra.highlight.cfg.Configurable.Stage.RESET;
import de.citec.csra.highlight.com.LightConnection;

/**
 *
 * @author pholthau
 */
public class LightConfiguration extends HighlightTarget {

	public LightConfiguration(String name) throws InterruptedException {
		LightConnection li = new LightConnection(name);
		super.setInit(li, INIT, 50);
		super.setPrepare(li, PREPARE, 500);
		super.setExecution(li, EXEC);
		super.setReset(li, RESET, 50);
	}
}
