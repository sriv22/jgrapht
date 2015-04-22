/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Creator:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
/* ----------------
 * AllAlgTests.java
 * ----------------
 * (C) Copyright 2003-2008, by Barak Naveh and Contributors.
 *
 * Original Author:  Barak Naveh
 * Contributor(s):   -
 *
 * $Id$
 *
 * Changes
 * -------
 * 24-Jul-2003 : Initial revision (BN);
 *
 */
package org.jgrapht.alg;

import org.jgrapht.experimental.isomorphism.*;
import org.junit.runner.*;
import org.junit.runners.*;

/**
 * A TestSuite for all tests in this package.
 *
 * @author Barak Naveh
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    BellmanFordShortestPathTest.class,
    BiconnectivityInspectorTest.class,
    BlockCutpointGraphTest.class,
    BronKerboschCliqueFinderTest.class,
    ChromaticNumberTest.class,
    ConnectivityInspectorTest.class,
    CycleDetectorTest.class,
    DijkstraShortestPathTest.class,
    EdmondsBlossomShrinkingTest.class,
    EdmondsKarpMaximumFlowTest.class,
    EulerianCircuitTest.class,
    FloydWarshallShortestPathsTest.class,
    HamiltonianCycleTest.class,
    HopcroftKarpBipartiteMatchingTest.class,
    IsomorphismInspectorTest.class,
    KShortestPathCostTest.class,
    KShortestPathKValuesTest.class,
    KSPDiscardsValidPathsTest.class,
    KSPExampleTest.class,
    KuhnMunkresMinimalWeightBipartitePerfectMatchingTest.class,
    MinimumSpanningTreeTest.class,
    MinSourceSinkCutTest.class,
    NaiveLcaFinderTest.class,
    NeighborIndexTest.class,
    StoerWagnerMinimumCutTest.class,
    TarjanLowestCommonAncestorTest.class,
    TransitiveClosureTest.class,
    VertexCoversTest.class,
    AssertGetPathsTest.class,
    AssertKShortestPathsFinderTest.class

})
public final class AllAlgTests
{
}
// End AllAlgTests.java
