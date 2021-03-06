/**
 * 
 * COPYRIGHT (C) 2010, 2011, 2012, 2013 AGETO Innovation GmbH
 * 
 * Authors Christian Kahlo, Ralf Wondratschek
 * 
 * All Rights Reserved.
 * 
 * Contact: PersoApp, http://www.persoapp.de
 * 
 * @version 1.0, 29.01.2015 09:57:02
 * 
 *          This file is part of PersoApp.
 * 
 *          PersoApp is free software: you can redistribute it and/or modify it
 *          under the terms of the GNU Lesser General Public License as
 *          published by the Free Software Foundation, either version 3 of the
 *          License, or (at your option) any later version.
 * 
 *          PersoApp is distributed in the hope that it will be useful, but
 *          WITHOUT ANY WARRANTY; without even the implied warranty of
 *          MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *          Lesser General Public License for more details.
 * 
 *          You should have received a copy of the GNU Lesser General Public
 *          License along with PersoApp. If not, see
 *          <http://www.gnu.org/licenses/>.
 * 
 *          Diese Datei ist Teil von PersoApp.
 * 
 *          PersoApp ist Freie Software: Sie können es unter den Bedingungen der
 *          GNU Lesser General Public License, wie von der Free Software
 *          Foundation, Version 3 der Lizenz oder (nach Ihrer Option) jeder
 *          späteren veröffentlichten Version, weiterverbreiten und/oder
 *          modifizieren.
 * 
 *          PersoApp wird in der Hoffnung, dass es nützlich sein wird, aber OHNE
 *          JEDE GEWÄHRLEISTUNG, bereitgestellt; sogar ohne die implizite
 *          Gewährleistung der MARKTFÄHIGKEIT oder EIGNUNG FÜR EINEN BESTIMMTEN
 *          ZWECK. Siehe die GNU Lesser General Public License für weitere
 *          Details.
 * 
 *          Sie sollten eine Kopie der GNU Lesser General Public License
 *          zusammen mit diesem Programm erhalten haben. Wenn nicht, siehe
 *          <http://www.gnu.org/licenses/>.
 * 
 */

package de.persoapp.core.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import de.persoapp.core.tests.core.ECardWorkerTest;
import de.persoapp.core.tests.core.card.CMacTest;
import de.persoapp.core.tests.core.card.CardHandlerTest;
import de.persoapp.core.tests.core.card.EC_GlobalsTest;
import de.persoapp.core.tests.core.card.ISOSMTransportTest;
import de.persoapp.core.tests.core.card.JSCIOTransportTest;
import de.persoapp.core.tests.core.card.PACETest;
import de.persoapp.core.tests.core.client.EAC_InfoTest;
import de.persoapp.core.tests.core.client.ECardSessionTest;
import de.persoapp.core.tests.core.client.IMainViewTest;
import de.persoapp.core.tests.core.client.MainViewEventListenerTest;
import de.persoapp.core.tests.core.client.PropertyResolverTest;
import de.persoapp.core.tests.core.client.SecureHolderTest;
import de.persoapp.core.tests.core.paos.MiniHttpClientTest;
import de.persoapp.core.tests.core.paos.PAOSInitiatorFactoryTest;
import de.persoapp.core.tests.core.paos.PAOSInitiatorTest;
import de.persoapp.core.tests.core.tls.BCTlsAuthenticationTest;
import de.persoapp.core.tests.core.tls.BCTlsSessionTest;
import de.persoapp.core.tests.core.tls.BCTlsSocketFactoryImplTest;
import de.persoapp.core.tests.core.tls.BCTlsSocketImplTest;
import de.persoapp.core.tests.core.tls.TLSClientTest;
import de.persoapp.core.tests.core.tls.TLSPSKClientTest;
import de.persoapp.core.tests.core.util.ArrayToolTest;
import de.persoapp.core.tests.core.util.HexTest;
import de.persoapp.core.tests.core.util.MyHexBinaryAdapterTest;
import de.persoapp.core.tests.core.util.TLVTest;
import de.persoapp.core.tests.core.util.UtilTest;
import de.persoapp.core.tests.core.ws.WebServiceTest;
import de.persoapp.core.tests.core.ws.engine.WSContainerTest;
import de.persoapp.core.tests.core.ws.engine.WSEndpointTest;

/**
 * Class for all testcases.
 * 
 * @author Rico Klimsa
 */
@RunWith(Suite.class)
@SuiteClasses({ Complete.class, WebServiceTest.class, ECardWorkerTest.class,
		ArrayToolTest.class, MyHexBinaryAdapterTest.class, UtilTest.class,
		HexTest.class, CardHandlerTest.class, CMacTest.class,
		EC_GlobalsTest.class, ISOSMTransportTest.class,
		JSCIOTransportTest.class, PACETest.class, EAC_InfoTest.class,
		ECardSessionTest.class, IMainViewTest.class,
		MainViewEventListenerTest.class, PropertyResolverTest.class,
		SecureHolderTest.class, MiniHttpClientTest.class,
		PAOSInitiatorTest.class, PAOSInitiatorFactoryTest.class,
		BCTlsAuthenticationTest.class, BCTlsSessionTest.class,
		BCTlsSocketFactoryImplTest.class, BCTlsSocketImplTest.class,
		TLSClientTest.class, TLSPSKClientTest.class, WSContainerTest.class,
		WSEndpointTest.class,TLVTest.class })
public class AllTests {

}
