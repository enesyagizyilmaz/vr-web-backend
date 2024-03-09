package com.vrwebbackend.ws.achievement;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AchievementService
{
    public ResponseEntity<Object> getUnit1Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Structure and rotation of the Sun\", " +
                "\"topic1Achievement1\": \"The geometric shape of the Sun is mentioned\", " +
                "\"topic1Achievement2\": \"It is mentioned that the Sun consists of layers like the Earth, but the structure of the layers is not mentioned\", " +
                "\"topic1Achievement3\": \"It is stated that the Sun rotates\", " +
                "\"topic2\": \"Structure and Features of the Moon\", " +
                "\"topic2Achievement1\": \"The size of the Moon is indicated\", " +
                "\"topic2Achievement2\": \"The geometric shape of the Moon is mentioned\", " +
                "\"topic2Achievement3\": \"Information is given about the surface structure of the Moon\", " +
                "\"topic3\": \"Movements and Phases of the Moon\", " +
                "\"topic3Achievement1\": \"Explains the rotation and rotation movements of the Moon\", " +
                "\"topic3Achievement2\": \"It is stated that the Moon rotates.\", " +
                "\"topic3Achievement3\": \"Explains the relationship between the phases of the Moon and the Moon's orbit around the Earth\", " +
                "\"topic4\": \"Sun, Earth and Moon\", " +
                "\"topic4Achievement1\": \"Prepares a model representing the movements of the Sun, Earth and Moon relative to each other\", " +
                "\"topic4Achievement2\": \"The direction of the Moon's orbit around the Earth is indicated\", " +
                "\"topic4Achievement3\": \"The direction of the Earth's orbit around the Sun is indicated\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit2Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Observes the existence of microscopic creatures with the help of a microscope\", " +
                "\"topic1Achievement1\": \"Parts of the microscope are not mentioned\", " +
                "\"topic1Achievement2\": \"Necessary precautions regarding safety and hygiene are taken when observing microscopic creatures.\", " +
                "\"topic2\": \"Gives examples of living things and classifies them according to their similarities and differences.\", " +
                "\"topic2Achievement1\": \"Examples are given of microscopic creatures (bacteria, amoeba, euglena and paramecium) and capped mushrooms.\", " +
                "\"topic2Achievement2\": \"A warning is given not to eat poisonous mushrooms.\", " +
                "\"topic2Achievement3\": \"Living things; classified as plants, animals, fungi and microscopic creatures\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit3Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Measuring Force\", " +
                "\"topic1Achievement1\": \"Measures the magnitude of the force with a dynamometer\", " +
                "\"topic1Achievement2\": \"Newton (N) is used as the unit of force\", " +
                "\"topic1Achievement3\": \"Designs a dynamometer model using simple tools\", " +
                "\"topic2\": \"Frictional force\", " +
                "\"topic2Achievement1\": \"Gives examples of friction force from daily life\", " +
                "\"topic2Achievement2\": \"Discovers the effect of friction force on motion in various environments by experimenting\", " +
                "\"topic2Achievement3\": \"Generates new ideas to increase or decrease friction in daily life\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit4Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Melting, freezing, boiling, condensation, evaporation, sublimation, frost\", " +
                "\"topic1Achievement1\": \"She makes inferences based on the data obtained from her experiments regarding the fact that substances can change state under the influence of heat.\", " +
                "\"topic1Achievement2\": \"The basic difference between evaporation and boiling is explained by stating that liquids evaporate at all temperatures but boil at a certain temperature.\", " +
                "\"topic2\": \"Melting and freezing point, boiling point\", " +
                "\"topic2Achievement1\": \"As a result of her experiments, she determines the melting, freezing and boiling points of pure substances.\", " +
                "\"topic2Achievement2\": \"It is emphasized that melting, freezing and boiling points are distinguishing features.\", " +
                "\"topic3\": \"Heat, temperature, heat exchange\", " +
                "\"topic3Achievement1\": \"Explain the basic differences between heat and temperature.\", " +
                "\"topic3Achievement2\": \"Conducts experiments on heat exchange as a result of mixing liquids with different temperatures and interprets the results.\", " +
                "\"topic4\": \"Expansion, contraction\", " +
                "\"topic4Achievement1\": \"He conducts experiments on the expansion and contraction of substances under the influence of heat and discusses the results of the experiments.\", " +
                "\"topic4Achievement2\": \"Relates examples from daily life to expansion and contraction events\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit5Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Propagation of light\", " +
                "\"topic1Achievement1\": \"It shows by observing and drawing that the light coming from a source follows a linear path in all directions.\", " +
                "\"topic2\": \"Uniform reflection, diffuse reflection, incident ray, reflected ray, surface normal\", " +
                "\"topic2Achievement1\": \"Observes the reflections of light on smooth and rough surfaces and shows them with drawings.\", " +
                "\"topic2Achievement2\": \"It explains the relationship between the incident ray, the reflected ray and the normal to the surface in the reflection of light.\", " +
                "\"topic3\": \"Transparent materials, translucent materials, non-transparent materials\", " +
                "\"topic3Achievement1\": \"Classifies substances according to their ability to transmit light.\", " +
                "\"topic4\": \"Umbra, variables affecting umbra\", " +
                "\"topic4Achievement1\": \"Observes how the shadow is formed and shows it with simple ray drawings.\", " +
                "\"topic4Achievement2\": \"He discovers by experimenting what variables affect the shadow.\", " +
                "\"topic4Achievement3\": \"Shadow plays are mentioned.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit6Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Biodiversity\", " +
                "\"topic1Achievement1\": \"Questions the importance of biodiversity for natural life.\", " +
                "\"topic1Achievement2\": \"Discusses the factors that threaten biodiversity based on research data\", " +
                "\"topic2\": \"Human and Environment Relationship\", " +
                "\"topic2Achievement1\": \"The negative effects of environmental pollution on people's health are addressed.\", " +
                "\"topic2Achievement2\": \"It offers suggestions for solving an environmental problem in its immediate surroundings or in our country.\", " +
                "\"topic2Achievement3\": \"Discusses the benefits and harms in human-environment interaction using examples.\", " +
                "\"topic3\": \"Catastrophic Natural Events\", " +
                "\"topic3Achievement1\": \"Explains destructive natural events caused by natural processes.\", " +
                "\"topic3Achievement2\": \"Earthquakes, volcanic eruptions, floods, landslides and hurricanes are mentioned without going into detail.\", " +
                "\"topic3Achievement3\": \"It refers to ways of protection from destructive natural events.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit7Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Symbols of circuit elements, circuit diagrams\", " +
                "\"topic1Achievement1\": \"It shows the elements in an electrical circuit with their symbols.\", " +
                "\"topic1Achievement2\": \"The importance of circuit symbols in terms of common scientific language is stated.\", " +
                "\"topic1Achievement3\": \"Creates a diagram of the electrical circuit he has drawn\", " +
                "\"topic2\": \"Number of batteries, number of lamps\", " +
                "\"topic2Achievement1\": \"Dependent, independent and controlled variable concept groups are explained with examples.\", " +
                "\"topic2Achievement2\": \"The number of batteries and the number of bulbs are taken into account as independent variables.\", " +
                "\"topic2Achievement3\": \"Parallel connection is not allowed.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade6Achievement()
    {
        String jsonString = "{\"topic1\": \"Compares the planets in the solar system with each other.\", " +
                "\"topic1Achievement1\": \"Basic characteristics of planets (terrestrial, gaseous, inner planet, outer planet) are mentioned.\", " +
                "\"topic1Achievement2\": \"It is said that planets have satellites.\", " +
                "\"topic1Achievement3\": \"The sizes of the planets are referred to spatially.\", " +
                "\"topic2\": \"Predicts how a solar eclipse occurs.\", " +
                "\"topic2Achievement1\": \"It refers to the phase of the Moon during the solar eclipse.\", " +
                "\"topic2Achievement2\": \"It is mentioned that there is no solar eclipse every month.\", " +
                "\"topic3\": \"Predicts how a lunar eclipse occurs.\", " +
                "\"topic3Achievement1\": \"It refers to the phase of the Moon during a lunar eclipse.\", " +
                "\"topic3Achievement2\": \"It is mentioned that there is no lunar eclipse every month.\"} ";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade7Achievement()
    {
        String jsonString = "{\"topic1\": \"Satellite, space pollution, sky observation tools\", " +
                "\"topic1Achievement1\": \"Explains space technologies.\", " +
                "\"topic1Achievement2\": \"Expresses the causes of space pollution and predicts the possible consequences of this pollution.\", " +
                "\"topic1Achievement3\": \"Explains the relationship between technology and space exploration.\", " +
                "\"topic2\": \"Star, Constellation, Galaxy, Black hole\", " +
                "\"topic2Achievement1\": \"Becomes aware of the star formation process.\", " +
                "\"topic2Achievement2\": \"Explains the concept of star.\", " +
                "\"topic2Achievement3\": \"Explains the structure of galaxies.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}
