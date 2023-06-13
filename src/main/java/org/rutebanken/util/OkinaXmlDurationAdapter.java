/*
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *   https://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and
 * limitations under the Licence.
 */

package org.rutebanken.util;


import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import javax.xml.datatype.Duration;
import javax.xml.datatype.DatatypeFactory;

public class OkinaXmlDurationAdapter extends XmlAdapter<String, Duration> {


    @Override
    public Duration unmarshal(String inputDuration) throws Exception {
        return DatatypeFactory.newInstance().newDuration(inputDuration);

    }

    @Override
    public String marshal(Duration inputDuration) throws Exception {

        if(inputDuration != null) {
            return inputDuration.toString();
        } else {
            return null;
        }
    }

}
