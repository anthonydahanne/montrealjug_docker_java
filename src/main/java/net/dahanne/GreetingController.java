package net.dahanne;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InfoCmd;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GreetingController {

    @Value("${dockerUrl}")
    private String dockerUrl;

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        DockerClient dockerClient = DockerClientBuilder.getInstance(dockerUrl).build();
        Info info = dockerClient.infoCmd().exec();


        List<Container> containers = dockerClient.listContainersCmd().withShowAll(false).exec();



        model.addAttribute("info", info);


        model.addAttribute("containers", containers);

        return "greeting";
    }

}