package org.jboss.test.clusterbench.ejb.stateful;

import javax.ejb.Remote;
import org.jboss.test.clusterbench.common.ejb.CommonStatefulSB;

/**
 * The enterprise bean must implement a business interface. That is, remote clients may not access an enterprise bean through a
 * no-interface view.
 *
 * @author Radoslav Husar
 * @version Dec 2011
 */
@Remote
public interface RemoteStatefulSB extends CommonStatefulSB {
    // Inherit.
}