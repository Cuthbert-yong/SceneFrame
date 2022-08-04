package top.angelinaBot.service;

import org.springframework.stereotype.Service;
import top.angelinaBot.annotation.AngelinaGroup;
import top.angelinaBot.model.MessageInfo;
import top.angelinaBot.model.ReplayInfo;

@Service
public class AboutService {

    @AngelinaGroup(keyWords = {"关于"})
    public ReplayInfo getAbout(MessageInfo messageInfo) {
        ReplayInfo replayInfo = new ReplayInfo(messageInfo);
        replayInfo.setReplayMessage("稀音近期开放加群，如果有愿意提供qq小号的朋友请联系稀音妈1790967910，谢谢！" +
                "\n项目地址https://github.com/Cuthbert-yong/SceneBot" +
                "\n原型AngelinaBot地址https://github.com/Strelizia02/AngelinaBot");
        return replayInfo;
    }

}
